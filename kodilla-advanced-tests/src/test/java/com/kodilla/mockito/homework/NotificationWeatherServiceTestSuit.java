package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

class NotificationWeatherServiceTestSuit {

    NotificationWeatherService notificationWeatherService = new NotificationWeatherService();
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Set<Client> clients = new HashSet<>();
    Set<Location> locations = new HashSet<>();

    @BeforeEach
    public void prepareData() {
        clients.add(client1);
        clients.add(client2);

        locations.add(location1);
        locations.add(location2);

        notificationWeatherService.addSubscriber(client1, location1);
        notificationWeatherService.addSubscriber(client1, location2);
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocationToWitchHeIsSubscribed() {
        for (Location location : locations) {
            notificationWeatherService.sentNotificationToLocation(notification, location);
        }
        Mockito.verify(client1, Mockito.times(2)).receive(notification);
    }

    @Test
    public void subscriberShouldBeAbleToRemoveSubscriptionFromLocation() {
        notificationWeatherService.removeSubscriptionFromLocation(client1, location1);
        for (Location location1 : locations) {
            notificationWeatherService.sentNotificationToLocation(notification, location1);
        }
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        notificationWeatherService.removeAllSubscriptions(client1);
        for (Location location : locations) {
            notificationWeatherService.sentNotificationToLocation(notification, location);
        }
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation() {
        notificationWeatherService.removeSubscriptionFromLocation(client1, location1);
        notificationWeatherService.addSubscriber(client2, location2);

        for (Location location : locations) {
            notificationWeatherService.sentNotificationToLocation(notification, location);
        }
        for (Client client : this.clients) {
            Mockito.verify(client, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {
        notificationWeatherService.addSubscriber(client2, location2);
        notificationWeatherService.addSubscriber(client2, location1);
        notificationWeatherService.sendNotificationToAll(notification);
        for (Client client : this.clients) {
            Mockito.verify(client, Mockito.times(1)).receive(notification);
        }
    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {
        notificationWeatherService.removeLocation(location1);

        for (Location location : locations) {
            notificationWeatherService.sentNotificationToLocation(notification, location);
        }
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
    }
}
