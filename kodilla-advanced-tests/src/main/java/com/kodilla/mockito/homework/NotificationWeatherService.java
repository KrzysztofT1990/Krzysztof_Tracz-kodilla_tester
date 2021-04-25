package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NotificationWeatherService {

    private HashMap<Client, Set<Location>> ClientInLocation = new HashMap<>();

    public void addSubscriber(Client client, Location location) {
        ClientInLocation.computeIfAbsent(client, u -> new HashSet<>()).add(location);
    }

    public void removeSubscriptionFromLocation(Client client, Location location) {
        this.ClientInLocation.entrySet()
                .stream()
                .filter(u -> u.getKey().equals(client))
                .forEach(u -> u.getValue().remove(location));
    }

    public void removeAllSubscriptions(Client client) {
        this.ClientInLocation.entrySet()
                .removeIf(u -> (client.equals(u.getKey())));
    }

    public void sentNotificationToLocation(Notification notification, Location location) {
        ClientInLocation.entrySet()
                .stream()
                .filter(u -> u.getValue().contains(location))
                .forEach(u -> u.getKey().receive(notification));
    }

    public void sendNotificationToAll(Notification notification) {
        ClientInLocation.entrySet()
                .stream()
                .forEach(u -> u.getKey().receive(notification));
    }

    public void removeLocation(Location location) {
        this.ClientInLocation.entrySet()
                .stream()
                .filter(u -> u.getValue().contains(location))
                .forEach(u -> u.getValue().remove(location));
    }

}
