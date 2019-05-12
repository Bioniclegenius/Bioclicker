package Bioclicker;

import java.util.List;

public class Resources {
    public List<Resource> resources;
	
    public Resources() {
        resources.add(new Resource("Bio", "Bioniclegenius"));
    }
	
    public Resource Get(String resName) {
        for(Resource res: resources){
            if(res.name == resName)
                return res;
        }
        return null;
    }
}
