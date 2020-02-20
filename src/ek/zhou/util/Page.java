package ek.zhou.util;

public class Page {
private int startIndex = 0;
private int pageNumber = 1;
private int pageSize = 5;
private int totalPage = 0;
private int totalRecord = 0;
public Page() {
	// TODO Auto-generated constructor stub
}
public Page(int pageNumber,int pageSize,int totalRecord) {
	this.pageNumber = pageNumber;
	this.pageSize = pageSize;
	this.totalRecord = totalRecord;
	if(totalRecord%pageSize==0){
		totalPage = totalRecord/pageSize;
	}else{
		totalPage = totalRecord/pageSize + 1;
	}
	startIndex = (pageNumber-1)*pageSize;
}
public void caculate(int totalRecord){
	this.totalRecord = totalRecord;
	if(totalRecord%pageSize==0){
		totalPage = totalRecord/pageSize;
	}else{
		totalPage = totalRecord/pageSize + 1;
	}
	startIndex = (pageNumber-1)*pageSize;
}
public int getStartIndex() {
	startIndex = (pageNumber-1)*pageSize;
	return startIndex;
}
public void setStartIndex(int startIndex) {
	this.startIndex = startIndex;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotalRecord() {
	return totalRecord;
}
public void setTotalRecord(int totalRecord) {
	this.totalRecord = totalRecord;
}
public int getPageNumber() {
	return pageNumber;
}
public void setPageNumber(int pageNumber) {
	this.pageNumber = pageNumber;
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}


}
