package com.java8.collection;

import java.util.Comparator;
import java.util.Date;

public class Article implements Comparable<Article>{

	
	@Override
	public int compareTo(Article article) {
		return this.id-article.id;
	}
	

	public static final Comparator<Article> dateComparator= new Comparator<Article>(){

		@Override
		public int compare(Article articleObj1, Article articleObj2) {

			return articleObj1.date.compareTo(articleObj2.date);
			
		}
		
	};
	
	public static final Comparator<Article> dateComparatorDes=new Comparator<Article>()
			{

				@Override
				public int compare(Article articleOjb, Article articleOjb2) {
					// TODO Auto-generated method stub
					return articleOjb2.date.compareTo(articleOjb.date);
				}
		
			};
	
	public Article(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	private Integer id;
	private String name;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
