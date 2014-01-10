package com.gs.action;

import java.util.Set;

import org.apache.solr.client.solrj.SolrServerException;

import com.gs.indexer.solr.SolrSearcher;
import com.gs.model.PagePOJO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport{
	private static final long serialVersionUID = -5206663242253958019L; 
	private Set<PagePOJO> set;
	public String search() throws SolrServerException{
		set = SolrSearcher.search("北京", "http://localhost:8888/solr");
		return SUCCESS;
	}
	/**
	 * @return the list
	 */
	public Set<PagePOJO> getList() {
		return set;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(Set<PagePOJO> list) {
		this.set = list;
	}
}
