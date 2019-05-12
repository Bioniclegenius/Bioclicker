package Bioclicker;

import java.util.List;

public class Resources {
	public List<Resource> Resources;
	
	public Resources() {
		
	}
	
	public Resource Get(String resName) {
		for(Resource res: Resources){
			if(res.Name == resName)
				return res;
		}
		return null;
	}
}
