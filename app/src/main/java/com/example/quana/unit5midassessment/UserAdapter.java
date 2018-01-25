package com.example.quana.unit5midassessment;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/**
 * Created by Quana on 1/24/18.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
        private List<Users> usersList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name, location, email, dob;

            public MyViewHolder (View view) {
                super (view);
                name = (TextView) view.findViewById(R.id.name);

            }
        }
}
