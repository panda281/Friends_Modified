package com.gebeya.friendAddress.Repository;

import com.gebeya.friendAddress.Model.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends CrudRepository<Friend,Integer> {
}
