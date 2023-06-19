package com.example.rest.services;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class IsCategoryNameNotNumeralService {

    private List<String> nameList;
    public IsCategoryNameNotNumeralService()
    {
        nameList = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/polishNumeralNames.txt")));
            String name;
            while ((name = reader.readLine()) != null)
            {
                nameList.add(name);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public boolean isCategoryNameNotNumeral(String name)
    {
        if(nameList.contains(name)) return true;
        else return false;
    }
}
