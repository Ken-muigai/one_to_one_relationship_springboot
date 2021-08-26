package com.kenjoel.want.to.repository;

import com.kenjoel.want.to.models.Packet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacketRespo extends JpaRepository<Packet, Integer> {
}
