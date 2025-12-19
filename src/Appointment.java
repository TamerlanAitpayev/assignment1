public class Appointment {
    private final Patient patient;
    private final Doctor doctor;
    private final String time;
    private boolean completed;

    public Appointment(Patient patient, Doctor doctor, String time) {
        if (patient == null) throw new IllegalArgumentException("Patient cannot be null.");
        if (doctor == null) throw new IllegalArgumentException("Doctor cannot be null.");
        if (time == null || time.isBlank()) throw new IllegalArgumentException("Time cannot be empty.");

        this.patient = patient;
        this.doctor = doctor;
        this.time = time;
        this.completed = false;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getTime() {
        return time;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        if (completed) {
            throw new IllegalStateException("Appointment is already completed.");
        }
        completed = true;
    }

    public String getStatus() {
        return completed ? "COMPLETED" : "SCHEDULED";
    }

    @Override
    public String toString() {
        return "Appointment{patient=" + patient.getName()
                + ", doctor=" + doctor.getName()
                + ", time='" + time + '\''
                + ", status=" + getStatus()
                + "}";
    }
}