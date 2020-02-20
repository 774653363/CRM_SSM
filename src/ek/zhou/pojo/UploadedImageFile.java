package ek.zhou.pojo;

import org.springframework.web.multipart.MultipartFile;

public class UploadedImageFile {
MultipartFile upload;

public MultipartFile getUpload() {
	return upload;
}

public void setUpload(MultipartFile upload) {
	this.upload = upload;
}

}
