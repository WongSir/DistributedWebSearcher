package com.gs.action;

import java.io.UnsupportedEncodingException;
import java.util.Set;

import org.apache.solr.client.solrj.SolrServerException;

import com.gs.indexer.solr.SolrSearcher;
import com.gs.model.PagePOJO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport{
	private static final long serialVersionUID = -5206663242253958019L; 
	private Set<PagePOJO> set;
	private String query;
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String search() throws SolrServerException, UnsupportedEncodingException{
		set = SolrSearcher.search(query, "http://localhost:8888/solr");
		return SUCCESS;
	}
	/**
	 * @return the list
	 */
	public Set<PagePOJO> getSet() {
		return set;
	}
	/**
	 * @param list the list to set
	 */
	public void setSet(Set<PagePOJO> set) {
		this.set = set;
	}
}
