package aurelienribon.ui.css.swing.processors;

import aurelienribon.ui.css.StyleProcessor;
import aurelienribon.ui.css.StyleRule;
import aurelienribon.ui.css.StyleRuleSet;
import aurelienribon.ui.css.swing.SwingRules;
import javax.swing.JComponent;
import javax.swing.border.Border;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class JComponentProcessor implements StyleProcessor<JComponent> {
	@Override
	public void process(JComponent target, StyleRuleSet rs) {
		StyleRule rule;

		rule = SwingRules.OPAQUE;
		if (rs.contains(rule)) {
			boolean value = (Boolean) rs.getParams(rule).get(0);
			target.setOpaque(value);
		}

		rule = SwingRules.TOOLTIP;
		if (rs.contains(rule)) {
			String value = (String) rs.getParams(rule).get(0);
			target.setToolTipText(value);
		}

		rule = SwingRules.BORDER;
		if (rs.contains(rule)) {
			Border value = (Border) rs.getParams(rule).get(0);
			target.setBorder(value);
		}
	}
}