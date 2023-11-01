package com.gebeya.friendAddress.Repository;

import com.gebeya.friendAddress.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
}
