package com.kenjoel.want.to.repository;

import com.kenjoel.want.to.models.Payload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayloadRepo extends JpaRepository<Payload, Integer> {
}
