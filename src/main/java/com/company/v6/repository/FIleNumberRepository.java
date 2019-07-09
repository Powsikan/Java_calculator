package com.company.v6.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FIleNumberRepository implements NumberRepository {

    @Override
    public List<Double> read() {
        List<Double> inputNumbers = new ArrayList<>();
        List<String> inputNumberStrs = null;
        try {
            inputNumberStrs = Files.readAllLines(Paths.get("D:\\JAVA\\InteliJ\\Calculator\\src\\main\\java\\com\\company\\numbers.txt"));
        } catch (IOException e) {
            e.printStackTrace(); //very bad
        }
        for (int i = 0; i<2; i++) {
            inputNumbers.add(Double.parseDouble(inputNumberStrs.get(i)));
        }
        return inputNumbers;
    }
}
