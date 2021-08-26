package com.kenjoel.want.to.repository;

import com.kenjoel.want.to.models.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialsRepo extends JpaRepository<Credentials, Integer> {
}
