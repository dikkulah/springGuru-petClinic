package com.dikkulah.springgurupetclinic.services;

import com.dikkulah.springgurupetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
