package pradita.id.ac.submissiondicodingandroidpemula.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import pradita.id.ac.submissiondicodingandroidpemula.R;
import pradita.id.ac.submissiondicodingandroidpemula.model.Assasin;

public class AssasinAdapter extends RecyclerView.Adapter<AssasinAdapter.ViewHolder> {

    private ArrayList<Assasin> assasinsList;

    public AssasinAdapter(ArrayList<Assasin> assasinsList) {
        this.assasinsList = assasinsList;
    }

    private AssasinAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(AssasinAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hero_assasin, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Assasin assasin = assasinsList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(assasin.getAssasin_image())
                .apply(new RequestOptions()).override(75,75)
                .into(holder.assasinImage);
        holder.assasinName.setText(assasin.getAssain_name());
        holder.assasinRole.setText(assasin.getRole_assasin());
        holder.assasinStory.setText(assasin.getStory_assasin());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(assasinsList.get(holder.getAdapterPosition()));
            }
        });

    }

    public interface OnItemClickCallback {
        void onItemClicked(Assasin data);
    }

    @Override
    public int getItemCount() {
        return assasinsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView assasinImage;
        TextView assasinName, assasinRole, assasinStory;

        public ViewHolder(View itemView) {
            super(itemView);

            assasinImage = itemView.findViewById(R.id.gambarAssasin);
            assasinName = itemView.findViewById(R.id.namaAssasin);
            assasinRole = itemView.findViewById(R.id.roieAssasin);
            assasinStory = itemView.findViewById(R.id.kisahAssasin);
        }
    }
}
