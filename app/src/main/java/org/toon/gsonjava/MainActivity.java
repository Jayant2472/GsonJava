package org.toon.gsonjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        String json = "{\n" +
                "  \"extra\": \"\",\n" +
                "  \"extra1\": \"\",\n" +
                "  \"mastersData\": \"\",\n" +
                "  \"message\": \"\",\n" +
                "  \"responseData\": {\n" +
                "    \"dashboardDataCount\": {\n" +
                "      \"section1\": [\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_TEACHER\",\n" +
                "          \"entityValue\": \"1\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_STUDENT\",\n" +
                "          \"entityValue\": \"6\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_SCHOOL\",\n" +
                "          \"entityValue\": \"1\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"section2\": [\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_TEACHER\",\n" +
                "          \"entityValue\": \"7\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_STUDENT\",\n" +
                "          \"entityValue\": \"4\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_SCHOOL\",\n" +
                "          \"entityValue\": \"1\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"section3\": [\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_TEACHER\",\n" +
                "          \"entityValue\": \"0\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_STUDENT\",\n" +
                "          \"entityValue\": \"0\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_SCHOOL\",\n" +
                "          \"entityValue\": \"0\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"section4\": [\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_TEACHER\",\n" +
                "          \"entityValue\": \"1\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_STUDENT\",\n" +
                "          \"entityValue\": \"6\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"entityName\": \"ROLE_SCHOOL\",\n" +
                "          \"entityValue\": \"1\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  },\n" +
                "  \"status\": \"SUCCESS\",\n" +
                "  \"statusCode\": \"1\",\n" +
                "  \"userType\": \"\"\n" +
                "}\n";
        DashboardResponse dashboardResponse = gson.fromJson(json, DashboardResponse.class);

        Log.v("mmm", dashboardResponse.getResponseData().getDashboardDataCount().getSection1().get(0).toString());

        /*List<DashboardCountDTO> section1 = new ArrayList<>();
        section1.add(new DashboardCountDTO("ROLE_TEACHER", "1"));
        section1.add(new DashboardCountDTO("ROLE_STUDENT", "6"));
        section1.add(new DashboardCountDTO("ROLE_SCHOOL", "1"));

        List<DashboardCountDTO> section2 = new ArrayList<>();
        section2.add(new DashboardCountDTO("ROLE_TEACHER", "7"));
        section2.add(new DashboardCountDTO("ROLE_STUDENT", "4"));
        section2.add(new DashboardCountDTO("ROLE_SCHOOL", "1"));

        List<DashboardCountDTO> section3 = new ArrayList<>();
        section3.add(new DashboardCountDTO("ROLE_TEACHER", "0"));
        section3.add(new DashboardCountDTO("ROLE_STUDENT", "0"));
        section3.add(new DashboardCountDTO("ROLE_SCHOOL", "0"));

        List<DashboardCountDTO> section4 = new ArrayList<>();
        section4.add(new DashboardCountDTO("ROLE_TEACHER", "1"));
        section4.add(new DashboardCountDTO("ROLE_STUDENT", "6"));
        section4.add(new DashboardCountDTO("ROLE_SCHOOL", "1"));

        DashboardDataDTO dashboardDataDTO = new DashboardDataDTO(section1, section2, section3, section4);

        DashboardResponseData dashboardResponseData = new DashboardResponseData(dashboardDataDTO);

        DashboardResponse dashboardResponse = new DashboardResponse("SUCCESS", "", "1", "", dashboardResponseData, "", "", "");

        String json = gson.toJson(dashboardResponse);

        Log.v("mmm", json);*/
    }
}
