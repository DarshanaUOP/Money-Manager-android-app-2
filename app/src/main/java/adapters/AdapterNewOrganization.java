package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.darshana.moneymanager.R;

import java.util.List;

import entities.EntityNewOrganization;

public class AdapterNewOrganization extends ArrayAdapter<EntityNewOrganization> {
    private Context context;
    private List<EntityNewOrganization> newOrganizationDetailsList;

    public AdapterNewOrganization(Context context, List<EntityNewOrganization> newOrganizationDetailsList) {
        super(context, R.layout.adapter_add_new_org,newOrganizationDetailsList);
        this.context = context;
        this.newOrganizationDetailsList = newOrganizationDetailsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.adapter_add_new_org,parent,false);

        ImageView newOrgPhoto;
        ImageButton editNewOrgPhoto,editEmail,editPhone;
        TextView addNewOrgName,addNewOrgEmail,addNewOrgPhone,addNewOrgAddress,addNewOrgDescription;
        Button addNewOrgSave;

        newOrgPhoto = (ImageView) view.findViewById(R.id.newOrgPhoto);

        editNewOrgPhoto = (ImageButton) view.findViewById(R.id.addNewOrgPhoto);
        editEmail = (ImageButton) view.findViewById(R.id.addNewOrgEmailButton);
        editPhone = (ImageButton) view.findViewById(R.id.addNewOrgPhoneButton);

        addNewOrgName = (TextView) view.findViewById(R.id.addNewOrgName);
        addNewOrgEmail = (TextView) view.findViewById(R.id.addNewOrgEmail);
        addNewOrgPhone = (TextView) view.findViewById(R.id.addNewOrgPhone);
        addNewOrgAddress = (TextView) view.findViewById(R.id.addNewOrgAddress);
        addNewOrgDescription = (TextView) view.findViewById(R.id.addNewOrgDescription);

        addNewOrgSave = (Button) view.findViewById(R.id.addNewOrgSaveButton);




    return view;
    }
}
