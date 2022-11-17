package com.hzh.store_management.data.model;

public class GoodsListItemBean {
    private String goods_id;
    private String goods_input_type;
    private String goods_list_num;
    private String goods_from;
    private String store_num;
    private String goods_manager;

    public String getGoods_from() {
        return goods_from;
    }

    public void setGoods_from(String goods_from) {
        this.goods_from = goods_from;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_input_type() {
        return goods_input_type;
    }

    public void setGoods_input_type(String goods_input_type) {
        this.goods_input_type = goods_input_type;
    }

    public String getGoods_list_num() {
        return goods_list_num;
    }

    public void setGoods_list_num(String goods_list_num) {
        this.goods_list_num = goods_list_num;
    }

    public String getGoods_manager() {
        return goods_manager;
    }

    public void setGoods_manager(String goods_manager) {
        this.goods_manager = goods_manager;
    }

    public String getStore_num() {
        return store_num;
    }

    public void setStore_num(String store_num) {
        this.store_num = store_num;
    }

    public GoodsListItemBean(String goods_id,String goods_input_type, String goods_list_num, String goods_from, String store_num, String goods_manager) {
        this.goods_id = goods_id;
        this.goods_input_type = goods_input_type;
        this.goods_list_num = goods_list_num;
        this.goods_from = goods_from;
        this.store_num = store_num;
        this.goods_manager = goods_manager;
    }
}