package local.jtst.domain;

import jodd.madvoc.meta.In;
public class DataTableReqModel {
	@In
	String		search;
	public String getSearch() {
		return search;
	}

	public void setSearch(final String search) {
		this.search = search;
	}
}
