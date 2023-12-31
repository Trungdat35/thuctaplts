package com.example.demo.service;

import com.example.demo.dto.OrderRequest;
import com.example.demo.dto.ProductViews;
import com.example.demo.dto.ThongTinDonHang;
import com.example.demo.dto.UpdateStatusOrder;
import com.example.demo.model.ProductReview;
import com.example.demo.model.Products;
import com.example.demo.model.Users;

import java.util.List;

public interface UserService {
    List<Users> getListUser();
    ProductReview updateReview(ProductReview productReview);
    List<ProductReview> getListPDR();
    void datHang(OrderRequest orderRequest);
    String getEmailByUserID(int userID);
    String huyDonHang(int orderID);
}
