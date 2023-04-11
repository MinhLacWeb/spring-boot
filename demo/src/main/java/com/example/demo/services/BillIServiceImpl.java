package com.example.demo.services;

import com.example.demo.entities.Bill;
import com.example.demo.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BillIServiceImpl implements BillService{
    @Autowired
    private BillRepository billRepository;
    @Override
    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public List<Bill> fetchBillList() {
        return billRepository.findAll();
    }

    @Override
    public Bill updateBill(Bill bill, int billID) {
        Bill billDB = billRepository.findById(billID).get();
        if (Objects.nonNull(bill.getBillID())){
            billDB.setBillID(bill.getBillID());
        }
        if (Objects.nonNull(bill.getCustomerID())){
            billDB.setCustomerID(bill.getCustomerID());
        }
        if (Objects.nonNull(bill.getTotalPrice())){
            billDB.setTotalPrice(bill.getTotalPrice());
        }
        if (Objects.nonNull(bill.getDate())&&!"".equalsIgnoreCase(bill.getDate())){
            billDB.setDate(bill.getDate());
        }
        return saveBill(billDB);
    }

    @Override
    public void deleteBillByID(int billID) {
        billRepository.deleteById(billID);
    }
}
