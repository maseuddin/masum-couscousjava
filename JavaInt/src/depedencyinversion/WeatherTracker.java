package depedencyinversion;

public class WeatherTracker {
    private String conditions;
    Phone phone;
    Email email;

    public WeatherTracker() {
        phone = new Phone();
        email = new Email();
    
            private String conditions;

            public void setConditions(String weather) {
                this.conditions = weather;
            }

            public void notify(Notifier notifier) {
                notifier.alertWeatherConditions(conditions);
            }

            public String getConditions() {
                return conditions;
            }
        }
        }
  
