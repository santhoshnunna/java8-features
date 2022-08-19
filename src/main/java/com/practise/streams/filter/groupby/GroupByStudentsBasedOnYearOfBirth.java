package com.practise.streams.filter.groupby;

import com.practise.data.EStudent;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStudentsBasedOnYearOfBirth {

    public static void main(String... args) {

        List<EStudent> studentList = new ArrayList<>();
        studentList.add(new EStudent("100", "firstName1", "lastName1",
                Date.from(LocalDate.of(2000, 12, 31)
                        .atStartOfDay().atZone(ZoneId.systemDefault())
                        .toInstant())));
        studentList.add(new EStudent("101", "firstName2", "lastName2",
                Date.from(LocalDate.of(2000, 11, 30)
                        .atStartOfDay().atZone(ZoneId.systemDefault())
                        .toInstant())));
        studentList.add(new EStudent("102", "firstName3", "lastName3",
                Date.from(LocalDate.of(2001, 12, 29)
                        .atStartOfDay().atZone(ZoneId.systemDefault())
                        .toInstant())));

        Map<Integer, List<EStudent>> map = studentList.stream()
                .collect(
                        Collectors.groupingBy(
                                EStudent::getYearOfBirth
                        )
                );
        System.out.println(map);

    }
}
