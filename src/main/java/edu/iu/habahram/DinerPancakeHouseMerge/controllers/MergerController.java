package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;

import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin

public class MergerController {

    MergerRepository mergerRepository;

    public MergerController(MergerRepository mergerRepository) {
        this.mergerRepository = mergerRepository;
    }

    @GetMapping("/merger")
    public List<MenuItemRecord> get() {
        List<MenuItemRecord> items = mergerRepository.getTheMenuItems();
        return items;
    }

    @GetMapping("/vegetarian")
    public List<MenuItemRecord> getVegetarianItems() {
        return mergerRepository.getTheMenuItems().stream()
                .filter(MenuItemRecord::vegetarian)
                .toList();
    }

    @GetMapping("/lunch")
    public List<MenuItemRecord> getlunch() {
        List<MenuItemRecord> items = mergerRepository.getsertainItems("Lunch");
        return items;
    }

    @GetMapping("/breakfast")
    public List<MenuItemRecord> getbr() {
        List<MenuItemRecord> items = mergerRepository.getsertainItems("Breakfast");
        return items;
    }

    @GetMapping("/supper")
    public List<MenuItemRecord> getsuper() {
        List<MenuItemRecord> items = mergerRepository.getsertainItems("Dinner");
        return items;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Customer customer) {
        // WARNING: Storing plain text passwords is insecure. This is for demonstration only.
        try {
            String customerInfo = customer.username() + "," + customer.password() + "," + customer.email() + "\n";
            Files.writeString(Paths.get("Data/customers.txt"), customerInfo, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            return ResponseEntity.ok("Signup successful");
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Signup failed");
        }
    }


}


