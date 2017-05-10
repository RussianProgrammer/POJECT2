package sis.pewpew.utils;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import sis.pewpew.R;
import sis.pewpew.fragments.ProfileFragment;

public class AchievesRecyclerViewAdapter extends RecyclerView.Adapter<AchievesRecyclerViewAdapter.ViewHolder> {

    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private ProfileFragment profile = new ProfileFragment();


    private String[] titles = {"",
            "Кабачок 2",
            "Кабачок 3",
            "Кабачок 4",
            "Кабачок 5",
    };


    private String[] locations = {"ВузЭкоФест - это некоммерческий просветительский проект, направленный на развитие экологичного образа жизни. Ключевое мероприятие проекта - ежегодный молодежный фестиваль ВузЭкоФест, который в 2017 году состоится уже третий раз. С 17 по 30 апреля в 50+ вузах Москвы, Санкт-Петербурга и других крупных городов России пройдут экологические мероприятия, организованные силами студентов, преподавателей и сотрудников этих вузов.",
            "Подробное описание фестиваля 2, где рассказывается о его особенностях и как там классно в принципе.",
            "Подробное описание фестиваля 3, где рассказывается о его особенностях и как там классно в принципе.",
            "Подробное описание фестиваля 4, где рассказывается о его особенностях и как там классно в принципе.",
            "Подробное описание фестиваля 5, где рассказывается о его особенностях и как там классно в принципе.",
    };

    private int[] images = {R.drawable.profile_icon,
            R.drawable.profile_icon,
            R.drawable.profile_icon,
            R.drawable.profile_icon,
            R.drawable.profile_icon,
    };

    private String[] details = {"с 17 по 30 апреля",
            "12 апреля - 14 июня",
            "12 апреля - 14 июня",
            "12 апреля - 14 июня",
            "12 апреля - 14 июня",
    };

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView achieveImage;
        TextView achieveTitle;
        TextView achieveDetail;
        TextView achieveLocation;
        TextView achieveProgress;

        ViewHolder(View itemView) {
            super(itemView);
            achieveImage = (ImageView) itemView.findViewById(R.id.achieves_icon);
            achieveTitle = (TextView) itemView.findViewById(R.id.achieves_name);
            achieveLocation = (TextView) itemView.findViewById(R.id.achieves_location);
            achieveProgress = (TextView) itemView.findViewById(R.id.achieves_progress);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.achieves_card_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AchievesRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.achieveImage.setImageResource(images[i]);
        viewHolder.achieveTitle.setText(titles[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

}

