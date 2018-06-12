package in.eyehunt.retrofitandroidexamplekotlin;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Eyehunt Team on 12/06/18.
 */

public interface Api {

    @GET("users?q=rokano")
    Call<UsersList> getUsers();
}
