import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.procom18.assasin.procom18.ComFragment;
import com.procom18.assasin.procom18.MoreFragment;

/**
 * Created by User on 3/22/2018.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PageAdapter(FragmentManager fm,int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){
            case 0:
                ComFragment cf = new ComFragment();
                return cf;
            case 1:
                MoreFragment mf = new MoreFragment();
                return  mf;
            default:
            return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
