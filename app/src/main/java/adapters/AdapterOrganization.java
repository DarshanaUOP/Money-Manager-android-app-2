package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.darshana.moneymanager.R;

import java.util.List;

import entities.EntityOrganization;

public class AdapterOrganization extends ArrayAdapter<EntityOrganization> {

    private Context context;
    private List<EntityOrganization> organizationList;


    public AdapterOrganization(Context context, List<EntityOrganization> organizationList) {
        super(context, R.layout.adapter_organization,organizationList);
        this.context = context;
        this.organizationList = organizationList;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.adapter_organization,parent,false);

        ImageView orgIcon;
        TextView orgTitle,orgDescription;

        orgIcon = (ImageView) view.findViewById(R.id.orgImage);
        orgTitle = (TextView) view.findViewById(R.id.orgTitle);
        orgDescription = (TextView) view.findViewById(R.id.orgDesc);

        orgIcon.setImageResource(organizationList.get(position).getPhoto());
        orgTitle.setText(organizationList.get(position).getOrgName());
        orgDescription.setText(organizationList.get(position).getOrgDescription());

        return view;
    }
}
