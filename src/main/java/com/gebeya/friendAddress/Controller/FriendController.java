package com.gebeya.friendAddress.Controller;

import com.gebeya.friendAddress.Model.Friend;
import com.gebeya.friendAddress.Repository.AddressRepository;
import com.gebeya.friendAddress.Repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {
    @Autowired
    FriendRepository friendRepository;

    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/friend")
    public void addFriend(@RequestBody Friend friend)
    {
        friendRepository.save(friend);
    }

    @GetMapping("/friend")
    public Iterable<Friend> getAllFriend()
    {
        return friendRepository.findAll();
    }
}
