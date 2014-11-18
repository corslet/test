package com.test.work.dao;

import java.util.List;

import com.test.work.model.Storefront;

public interface StorefrontDao extends AbstractDao<Storefront, String>
{
	void saveStorefront(Storefront storefront);
	List<Storefront> findUsers(String userName);
}
