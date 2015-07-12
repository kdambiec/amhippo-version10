package anandamarga.beans;

import org.hippoecm.hst.core.parameters.FieldGroup;
import org.hippoecm.hst.core.parameters.FieldGroupList;
import org.hippoecm.hst.core.parameters.Parameter;

/**
 * Created by karun on 08/02/15.
 */
@FieldGroupList({@FieldGroup(
        titleKey = "fields.am",
        value = {"copyrightInfo"}
)})
public interface AMChannelInfo extends PiwikChannelInfo {

    @Parameter(name = "copyrightInfo", defaultValue="Ananda Marga Pracarakaha Samgha")
    String getCopyrightInfo();
}
