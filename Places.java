
import androidx.annotation.NonNull;

import androidx.annotation.Nullable;

import androidx.room.ColumnInfo;

import androidx.room.Entity;

import androidx.room.PrimaryKey;

@Entity

@Entity(tableName = "places")

public class Places{

	@PrimaryKey(autoGenerate = true)

	@NonNull

	@ColumnInfo(name = "placesId")

	private int mId; 

	@Nullable

	@ColumnInfo(name = "placestCreationDate")

	private String mCreationDate;

	@Nullable

	@ColumnInfo(name = "placesName")

	private String mName;
	@Nullable

	@ColumnInfo(name = "LocationCity")

	private String mLocationCity; 

	@Nullable

	@ColumnInfo(name = "placesScore")

	private int mScore;

	public Places(@Nullable String creationdate, String title, int score, String locationCity) {

    mCreationDate = creationdate;

    mName = name;

    mLocationCity = Locationcity;

    mScore = score;
	}

	public int getId() {
		return mId;
	}

	public void setId(int mId) {
		mId = Id;
	}

	public String getCreationDate() {
		return mCreationDate;
	}

	public void setmCreationDate(String CreationDate) {
		mCreationDate = CreationDate;
	}

	public String getName() {
		return mTitle;
	}

	public void setName(String mName) {
		mName = Name;
	}

	public String getLocationCity() {
		return mCity;
	}

	public void setLocationCity(String mLocationCity) {
		mLocationCity = LocationCity;
	}

	public int getScore() {
		return mScore;
	}

	public void setScore(int mScore) {
		mScore = Score;
	}

  //private int mScore
  //private int mCreationDate
}

