/*
Lara Campos N13 INF2CM
*/

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;

import androidx.room.ColumnInfo;

import androidx.room.Entity;

import androidx.room.PrimaryKey;

@Entity

@Entity(tableName = "places")//criação da entidade

public class Places{

	@PrimaryKey(autoGenerate = true)

	@NonNull

	@ColumnInfo(name = "placesId")

	private int mId; //identificador único

	@Nullable

	@ColumnInfo(name = "placestCreationDate")

	private String mCreationDate;//data de controle para o BD

	@Nullable

	@ColumnInfo(name = "placesTitle")

	private String mTitle; //nome do lugar

	@Nullable

	@ColumnInfo(name = "placesCity")

	private String mCity; //nome da cidade

	@Nullable

	@ColumnInfo(name = "placesScore")

	private int mScore; //nota do lugar de 0 à 10

	public Places(@Nullable String creationdate, String title, int score, String city) {

    mCreationDate = creationdate;

    mTitle = title;

    mCity = city;

    mScore = score;
	}

	//Gerando getters and setters

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

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String mTitle) {
		mTitle = Title;
	}

	public String getCity() {
		return mCity;
	}

	public void setSinger(String mCity) {
		mCity = City;
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

