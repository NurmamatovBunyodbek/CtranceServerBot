package org.example;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Converter {
    private static final String API_URL = "https://open.er-api.com/v6/latest/";
    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        try {
            URL url = new URL(API_URL + fromCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            //System.out.println(responseCode);
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JSONObject jsonObject = new JSONObject(response.toString());
                JSONObject rates = jsonObject.getJSONObject("rates");

                double result = -1.0;

                for (String key : rates.keySet()) {
                    double rate = rates.getDouble(key);
                    if (key.equals(toCurrency)) {
                        result = Math.round(amount * rate * 10.0) / 10.0;
                        break;
                    }
                }
                return result;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }
}
