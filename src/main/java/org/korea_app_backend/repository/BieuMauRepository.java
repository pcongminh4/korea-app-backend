package org.korea_app_backend.repository;

import org.korea_app_backend.model.BieuMauModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BieuMauRepository extends JpaRepository<BieuMauModel, Integer> {
    List<BieuMauModel> findByHoTenContainingIgnoreCase(String hoTen);
    List<BieuMauModel> findByNgayHen(LocalDate ngayHen);
    List<BieuMauModel> findByHoTenContainingIgnoreCaseAndNgayHen(String hoTen, LocalDate ngayHen);

}
