package uuu.mybuy.model;

import java.util.List;

import uuu.mybuy.domain.MyBuyException;

public interface DAOInsterface<K, T> {
	void insert(T date)throws MyBuyException;
	void update(T date)throws MyBuyException;
	void delete(T date)throws MyBuyException;
	public T get(K id)throws MyBuyException;
	public abstract List<T> getAll()throws MyBuyException;
}
