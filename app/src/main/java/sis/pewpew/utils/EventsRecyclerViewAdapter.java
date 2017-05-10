package sis.pewpew.utils;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import sis.pewpew.R;

public class EventsRecyclerViewAdapter extends RecyclerView.Adapter<EventsRecyclerViewAdapter.ViewHolder> {

    private String[] titles = {"ВузЭкоФест-2017",
            "Фестиваль 2",
            "Фестиваль 3",
            "Фестиваль 4",
            "Фестиваль 5",
    };

    private String[] details = {"ВузЭкоФест - это некоммерческий просветительский проект, направленный на развитие экологичного образа жизни. Ключевое мероприятие проекта - ежегодный молодежный фестиваль ВузЭкоФест, который в 2017 году состоится уже третий раз. С 17 по 30 апреля в 50+ вузах Москвы, Санкт-Петербурга и других крупных городов России пройдут экологические мероприятия, организованные силами студентов, преподавателей и сотрудников этих вузов.",
            "Подробное описание фестиваля 2, где рассказывается о его особенностях и как там классно в принципе.",
            "Подробное описание фестиваля 3, где рассказывается о его особенностях и как там классно в принципе.",
            "Подробное описание фестиваля 4, где рассказывается о его особенностях и как там классно в принципе.",
            "Подробное описание фестиваля 5, где рассказывается о его особенностях и как там классно в принципе.",
    };

    private int[] images = {R.drawable.events_picture1,
            R.drawable.events_picture1,
            R.drawable.events_picture1,
            R.drawable.events_picture1,
            R.drawable.events_picture1
    };

    private String[] addresses = {"Проходит в нескольких местах",
            "Tочный адрес фестиваля 2",
            "Tочный адрес фестиваля 3",
            "Tочный адрес фестиваля 4",
            "Tочный адрес фестиваля 5",
    };

    private String[] dates = {"с 17 по 30 апреля",
            "12 апреля - 14 июня",
            "12 апреля - 14 июня",
            "12 апреля - 14 июня",
            "12 апреля - 14 июня",
    };

    private String[] urls = {"www.vuzecofest.ru",
            "http://somefestival2.ru/",
            "http://somefestival3.ru/",
            "http://somefestival4.ru/",
            "http://somefestival5.ru/",
    };

    private String[] prizeFunds = {"1000",
            "1000",
            "1000",
            "1000",
            "1000",
    };


    class ViewHolder extends RecyclerView.ViewHolder {

        //public int currentItem;
        ImageView itemImage;
        TextView itemTitle;
        TextView itemDetail;
        TextView eventAddress;
        TextView eventDate;
        TextView eventUrl;
        TextView eventPrizeFund;


        ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);
            eventAddress = (TextView) itemView.findViewById(R.id.event_address);
            eventDate = (TextView) itemView.findViewById(R.id.event_date);
            eventUrl = (TextView) itemView.findViewById(R.id.event_url);
            eventPrizeFund = (TextView) itemView.findViewById(R.id.event_prize_fund);

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
                .inflate(R.layout.events_card_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.eventAddress.setText(addresses[i]);
        viewHolder.eventDate.setText(dates[i]);
        viewHolder.eventUrl.setText(urls[i]);
        viewHolder.eventPrizeFund.setText(prizeFunds[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}