package com.toe.sycweb.utils;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class SYCCloudinary {
	
	public static Cloudinary init() {
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "toe-inc",
				"api_key", "264447546126572",
				"api_secret", "dTsdxMgb2Z93THGv36WToo6ceds"));
		return cloudinary;
	}
}
