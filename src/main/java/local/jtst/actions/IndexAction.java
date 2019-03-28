package local.jtst.actions;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;

@MadvocAction
public class IndexAction extends jodd.joy.madvoc.AppAction {


	@Action(value = "html", alias = ALIAS_INDEX_NAME)
	public void view() {
		// empty - html
	}
}
