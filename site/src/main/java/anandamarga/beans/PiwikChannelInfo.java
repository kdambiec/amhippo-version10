package anandamarga.beans;

import org.hippoecm.hst.configuration.channel.ChannelInfo;
import org.hippoecm.hst.core.parameters.FieldGroup;
import org.hippoecm.hst.core.parameters.FieldGroupList;
import org.hippoecm.hst.core.parameters.Parameter;

/**
 * Created by karun on 07/02/15.
 */
@FieldGroupList({@FieldGroup(
        titleKey = "fields.piwik",
        value = {"cookieDomain", "siteId"}
)})
public interface PiwikChannelInfo extends ChannelInfo {

    @Parameter(name = "cookieDomain", defaultValue = "*.anandamarga-frankfurt.de")
    String getCookieDomain();

    @Parameter(name = "siteId", defaultValue = "2")
    String getSiteId();

}
