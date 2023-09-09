package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceTest {
//    void test_get_advice_in_bad_weather_mockito() {
//        // arange
//        Set<Preference> expected = Set.of(Preference.READING, Preference. WATCHING_FILMS, Preference. WALKING);
//
//        WeatherService weatherService = Mockito.mock(WeatherService.class);
//        PreferencesService preferencesService = Mockito.any(PreferencesService.class);
//        Mockito.when(preferencesService.get(Mockito.any(String.class)))
//                .thenReturn(Set.of(Preference.READING, Preference.WATCHING_FILMS, Preference.WALKING));//, Preference.FOOTBALL,
//
//        AdviceService adviceService = new AdviceService(preferencesService, weatherService);
//
//        // Act
//        Set<Preference> preferences = adviceService.getAdvice("user1");
//
//        // assert
//        Assertions.assertEquals(expected, preferences);
//    }


//    public String send(Map<String, String> headers) {
//        String ipAddress = String.valueOf(headers.get(IP_ADDRESS_HEADER));
//        if (ipAddress != null && !ipAddress.isEmpty()) {
//            Location location = geoService.byIp(ipAddress);
//            System.out.printf("Отправлено сообщение: %s", localizationService.locale(location.getCountry()));
//            return localizationService.locale(location.getCountry());
//        }
//        return localizationService.locale(Country.USA);
//    }

//        void test_send_mockito() {
//        // arange
//        Set<Preference> expected = Set.of(Preference.READING, Preference. WATCHING_FILMS, Preference. WALKING);
//
//        WeatherService weatherService = Mockito.mock(WeatherService.class);
//        PreferencesService preferencesService = Mockito.any(PreferencesService.class);
//        Mockito.when(preferencesService.get(Mockito.any(String.class)))
//                .thenReturn(Set.of(Preference.READING, Preference.WATCHING_FILMS, Preference.WALKING));//, Preference.FOOTBALL,
//
//        AdviceService adviceService = new AdviceService(preferencesService, weatherService);
//
//        // Act
//        Set<Preference> preferences = adviceService.getAdvice("user1");
//
//        // assert
//        Assertions.assertEquals(expected, preferences);
//    }


}
