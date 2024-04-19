public class MingleRequest {
    boolean engagedInMingle;
    // return 1 means accepted, 0 means denied, 2 means pending
    protected int mingleResponse(int responseCode)
    {
        engagedInMingle = false;
        if (responseCode == 200)
        {
            engagedInMingle=true;
            return 1;
        }
        else if (responseCode == 202)
            return 2;
        else
            return 0;
    }

}
