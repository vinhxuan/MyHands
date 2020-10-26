package com.example.myhands.model;

import java.sql.Date;

public class TaiKhoan {
    private int Id;
    private String sTenTaiKhoan;
    private String sMatKhau;
    private String sHoTen;
    private String sDiachi;
    private String sEmail;
    private String sSDT;
    private String dNgayTao;
    private String sNguoiTao;
    private String dNgaySua;
    private String sNguoiSua;
    private boolean bStatus;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String sTenTaiKhoan, String sMatKhau, String sHoTen, String sDiachi, String sEmail, String sSDT, String dNgayTao, String sNguoiTao, String dNgaySua, String sNguoiSua, boolean bStatus) {
        Id = id;
        this.sTenTaiKhoan = sTenTaiKhoan;
        this.sMatKhau = sMatKhau;
        this.sHoTen = sHoTen;
        this.sDiachi = sDiachi;
        this.sEmail = sEmail;
        this.sSDT = sSDT;
        this.dNgayTao = dNgayTao;
        this.sNguoiTao = sNguoiTao;
        this.dNgaySua = dNgaySua;
        this.sNguoiSua = sNguoiSua;
        this.bStatus = bStatus;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getsTenTaiKhoan() {
        return sTenTaiKhoan;
    }

    public void setsTenTaiKhoan(String sTenTaiKhoan) {
        this.sTenTaiKhoan = sTenTaiKhoan;
    }

    public String getsMatKhau() {
        return sMatKhau;
    }

    public void setsMatKhau(String sMatKhau) {
        this.sMatKhau = sMatKhau;
    }

    public String getsHoTen() {
        return sHoTen;
    }

    public void setsHoTen(String sHoTen) {
        this.sHoTen = sHoTen;
    }

    public String getsDiachi() {
        return sDiachi;
    }

    public void setsDiachi(String sDiachi) {
        this.sDiachi = sDiachi;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsSDT() {
        return sSDT;
    }

    public void setsSDT(String sSDT) {
        this.sSDT = sSDT;
    }

    public String getdNgayTao() {
        return dNgayTao;
    }

    public void setdNgayTao(String dNgayTao) {
        this.dNgayTao = dNgayTao;
    }

    public String getsNguoiTao() {
        return sNguoiTao;
    }

    public void setsNguoiTao(String sNguoiTao) {
        this.sNguoiTao = sNguoiTao;
    }

    public String getdNgaySua() {
        return dNgaySua;
    }

    public void setdNgaySua(String dNgaySua) {
        this.dNgaySua = dNgaySua;
    }

    public String getsNguoiSua() {
        return sNguoiSua;
    }

    public void setsNguoiSua(String sNguoiSua) {
        this.sNguoiSua = sNguoiSua;
    }

    public boolean isbStatus() {
        return bStatus;
    }

    public void setbStatus(boolean bStatus) {
        this.bStatus = bStatus;
    }
}
