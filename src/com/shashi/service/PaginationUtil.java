package com.shashi.service;

import java.util.List;

public class PaginationUtil<T> {
    private List<T> dataList;
    private int pageSize;
    
    public PaginationUtil(List<T> dataList, int pageSize) {
        this.dataList = dataList;
        this.pageSize = pageSize;
    }
    
    public List<T> getCurrentPageData(int pageNumber) {
        int startIndex = (pageNumber - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, dataList.size());
        return dataList.subList(startIndex, endIndex);
    }
    
    public int getTotalPages() {
        return (int) Math.ceil((double) dataList.size() / pageSize);
    }
}
