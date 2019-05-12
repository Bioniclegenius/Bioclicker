package Bioclicker;

import java.util.List;

public class Resources {
    public List<Resource> Resources;
	
    public Resources() {
        Resources.add(new Resource("Bio", "Bioniclegenius", 0, 0));
    }
	
    public Resource Get(String resName) {
        for(Resource res: Resources){
            if(res.Name == resName)
                return res;
        }
        return null;
    }
}
