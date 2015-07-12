package anandamarga.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;

@HippoEssentialsGenerated(internalName = "amhippo:ContactDocument")
@Node(jcrType = "amhippo:ContactDocument")
public class ContactDocument extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "amhippo:Contact Name")
	public String getContactName() {
		return getProperty("amhippo:Contact Name");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:address")
	public String getAddress() {
		return getProperty("amhippo:address");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:CityName")
	public String getCityName() {
		return getProperty("amhippo:CityName");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:email")
	public String getEmail() {
		return getProperty("amhippo:email");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:phoneNumber")
	public String getPhoneNumber() {
		return getProperty("amhippo:phoneNumber");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:mapApiAddress")
	public String getMapApiAddress() {
		return getProperty("amhippo:mapApiAddress");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:FacebookLink")
	public String getFacebookLink() {
		return getProperty("amhippo:FacebookLink");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:googlePlusLink")
	public String getGooglePlusLink() {
		return getProperty("amhippo:googlePlusLink");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:twitterLink")
	public String getTwitterLink() {
		return getProperty("amhippo:twitterLink");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:linkedInLink")
	public String getLinkedInLink() {
		return getProperty("amhippo:linkedInLink");
	}

	@HippoEssentialsGenerated(internalName = "amhippo:contactPhoto")
	public HippoGalleryImageSet getContactPhoto() {
		return getLinkedBean("amhippo:contactPhoto", HippoGalleryImageSet.class);
	}
}
