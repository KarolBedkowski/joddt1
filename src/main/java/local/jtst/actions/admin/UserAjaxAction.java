package local.jtst.actions.admin;

import jodd.joy.madvoc.AppAction;
import jodd.log.Logger;
import jodd.log.LoggerFactory;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.result.TextResult;
import local.jtst.domain.DataTableReqModel;

@MadvocAction
public class UserAjaxAction extends AppAction {
	static final Logger LOG = LoggerFactory.getLogger(UserAjaxAction.class);

	@Action("{:name}.json")
	public TextResult actions(
			@In("dt") final DataTableReqModel req,
			@In("userId") final Integer userId,
			@In final String query) {
		final String search = req.getSearch();
		LOG.info(search);
		LOG.info(query);
		return TextResult.of(search);
	}
}
