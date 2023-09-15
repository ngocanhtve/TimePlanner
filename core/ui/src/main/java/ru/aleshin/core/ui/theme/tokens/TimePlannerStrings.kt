/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.aleshin.core.ui.theme.tokens

import androidx.compose.runtime.staticCompositionLocalOf

/**
 * @author Stanislav Aleshin on 24.02.2023.
 */
data class TimePlannerStrings(
    val appName: String,
    val authorTitle: String,
    val startTaskNotifyText: String,
    val timeTaskChannelName: String,
    val categoryWorkTitle: String,
    val categoryRestTitle: String,
    val categorySportTitle: String,
    val categorySleepTitle: String,
    val categoryCultureTitle: String,
    val categoryAffairsTitle: String,
    val categoryTransportTitle: String,
    val categoryStudyTitle: String,
    val categoryEatTitle: String,
    val categoryEntertainmentsTitle: String,
    val categoryHugieneTitle: String,
    val categoryHealthTitle: String,
    val categoryShoppingTitle: String,
    val categoryOtherTitle: String,
    val minutesSymbol: String,
    val hoursSymbol: String,
    val separator: String,
    val alertDialogDismissTitle: String,
    val alertDialogSelectConfirmTitle: String,
    val alertDialogOkConfirmTitle: String,
    val categoryEmptyTitle: String,
    val expandedViewToggleTitle: String,
    val compactViewToggleTitle: String,
    val warningDialogTitle: String,
    val warningDeleteConfirmTitle: String,
    val hoursTitle: String,
    val minutesTitle: String,
    val homeTabTitle: String,
    val analyticsTabTitle: String,
    val settingsTabTitle: String,
    val mainDrawerTitle: String,
    val drawerMainSection: String,
    val templateDrawerTitle: String,
    val categoriesDrawerTitle: String,
    val splitFormat: String,
    val amFormatTitle: String,
    val pmFormatTitle: String,
    val repeatTimeDayInMonthTitle: String,
    val repeatTimeDayInWeekTitle: String,
    val repeatTimeWeekDayInMonthTitle: String,
    val repeatTimeDayInYearTitle: String,
    val sundayTitle: String,
    val mondayTitle: String,
    val tuesdayTitle: String,
    val wednesdayTitle: String,
    val thursdayTitle: String,
    val fridayTitle: String,
    val saturdayTitle: String,
    val januaryTitle: String,
    val februaryTitle: String,
    val marchTitle: String,
    val aprilTitle: String,
    val mayTitle: String,
    val juneTitle: String,
    val julyTitle: String,
    val augustTitle: String,
    val septemberTitle: String,
    val octoberTitle: String,
    val novemberTitle: String,
    val decemberTitle: String,
)

internal val russianTimePlannerString = TimePlannerStrings(
    appName = "Time Planner",
    authorTitle = "Created by Aleshin Stanislav",
    startTaskNotifyText = "Начало события",
    timeTaskChannelName = "События",
    categoryWorkTitle = "Работа",
    categoryRestTitle = "Отдых",
    categorySportTitle = "Спорт",
    categorySleepTitle = "Сон",
    categoryCultureTitle = "Культура",
    categoryAffairsTitle = "Дела",
    categoryTransportTitle = "Транспорт",
    categoryStudyTitle = "Учёба",
    categoryEatTitle = "Приём пищи",
    categoryEntertainmentsTitle = "Развлечение",
    categoryHugieneTitle = "Личная гигиена",
    categoryHealthTitle = "Медицина",
    categoryShoppingTitle = "Шопинг",
    categoryOtherTitle = "Разное",
    minutesSymbol = "м",
    hoursSymbol = "ч",
    separator = ":",
    alertDialogDismissTitle = "Отменить",
    alertDialogSelectConfirmTitle = "Выбрать",
    alertDialogOkConfirmTitle = "ОК",
    categoryEmptyTitle = "Отсутствует",
    expandedViewToggleTitle = "Расширенный вид",
    compactViewToggleTitle = "Компактный вид",
    warningDialogTitle = "Предупреждение!",
    warningDeleteConfirmTitle = "Удалить",
    hoursTitle = "Часы",
    minutesTitle = "Минуты",
    homeTabTitle = "Главная",
    analyticsTabTitle = "Аналитика",
    settingsTabTitle = "Настройки",
    mainDrawerTitle = "Главная",
    drawerMainSection = "Планы",
    templateDrawerTitle = "Шаблоны",
    categoriesDrawerTitle = "Категории",
    splitFormat = "%s | %s",
    amFormatTitle = "AM",
    pmFormatTitle = "PM",
    repeatTimeDayInMonthTitle = "Каждый месяц",
    repeatTimeDayInWeekTitle = "Каждую неделю",
    repeatTimeWeekDayInMonthTitle = "Каждую неделю месяца",
    repeatTimeDayInYearTitle = "Каждый год",
    sundayTitle = "Воскресенье",
    mondayTitle = "Понедельник",
    tuesdayTitle = "Вторник",
    wednesdayTitle = "Среда",
    thursdayTitle = "Четверг",
    fridayTitle = "Пятница",
    saturdayTitle = "Суббота",
    januaryTitle = "Январь",
    februaryTitle = "Февраль",
    marchTitle = "Март",
    aprilTitle = "Апрель",
    mayTitle = "Май",
    juneTitle = "Июнь",
    julyTitle = "Июль",
    augustTitle = "Август",
    septemberTitle = "Сентябрь",
    octoberTitle = "Октябрь",
    novemberTitle = "Ноябрь",
    decemberTitle = "Декабрь",
)

internal val englishTimePlannerString = TimePlannerStrings(
    appName = "Time Planner",
    authorTitle = "Created by Aleshin Stanislav",
    startTaskNotifyText = "The beginning of the event",
    timeTaskChannelName = "Events",
    categoryWorkTitle = "Work",
    categoryRestTitle = "Rest",
    categorySportTitle = "Sport",
    categorySleepTitle = "Sleep",
    categoryCultureTitle = "Culture",
    categoryAffairsTitle = "Affairs",
    categoryTransportTitle = "Transport",
    categoryStudyTitle = "Study",
    categoryEatTitle = "Eating",
    categoryEntertainmentsTitle = "Entertainments",
    categoryHugieneTitle = "Personal Care",
    categoryHealthTitle = "Medicine",
    categoryShoppingTitle = "Shopping",
    categoryOtherTitle = "Miscellaneous",
    minutesSymbol = "m",
    hoursSymbol = "h",
    separator = ":",
    alertDialogDismissTitle = "Cancel",
    alertDialogSelectConfirmTitle = "Select",
    alertDialogOkConfirmTitle = "OK",
    categoryEmptyTitle = "Absent",
    expandedViewToggleTitle = "Expanded view",
    compactViewToggleTitle = "Compact view",
    warningDialogTitle = "Warning!",
    warningDeleteConfirmTitle = "Delete",
    hoursTitle = "Hours",
    minutesTitle = "Minutes",
    homeTabTitle = "Home",
    analyticsTabTitle = "Analytics",
    settingsTabTitle = "Settings",
    mainDrawerTitle = "Main",
    drawerMainSection = "Plans",
    templateDrawerTitle = "Templates",
    categoriesDrawerTitle = "Categories",
    splitFormat = "%s | %s",
    amFormatTitle = "AM",
    pmFormatTitle = "PM",
    repeatTimeDayInWeekTitle = "Every week",
    repeatTimeWeekDayInMonthTitle = "Every week of the month",
    repeatTimeDayInMonthTitle = "Every month",
    repeatTimeDayInYearTitle = "Every year",
    sundayTitle = "Sunday",
    mondayTitle = "Monday",
    tuesdayTitle = "Tuesday",
    wednesdayTitle = "Wednesday",
    thursdayTitle = "Thursday",
    fridayTitle = "Friday",
    saturdayTitle = "Saturday",
    januaryTitle = "January",
    februaryTitle = "February",
    marchTitle = "March",
    aprilTitle = "April",
    mayTitle = "May",
    juneTitle = "June",
    julyTitle = "July",
    augustTitle = "August",
    septemberTitle = "September",
    octoberTitle = "October",
    novemberTitle = "November",
    decemberTitle = "December",
)

internal val germanTimePlannerString = TimePlannerStrings(
    appName = "Time Planner",
    authorTitle = "Created by Aleshin Stanislav",
    startTaskNotifyText = "Beginn eines Ereignisses",
    timeTaskChannelName = "Ereignisse",
    categoryWorkTitle = "Arbeit",
    categoryRestTitle = "Erholung",
    categorySportTitle = "Sport",
    categorySleepTitle = "Schlaf",
    categoryCultureTitle = "Die Kultur",
    categoryAffairsTitle = "Angelegenheiten",
    categoryTransportTitle = "Verkehr",
    categoryStudyTitle = "Studium",
    categoryEatTitle = "Mahlzeit",
    categoryEntertainmentsTitle = "Unterhaltung",
    categoryHugieneTitle = "Persönliche Hygiene",
    categoryHealthTitle = "Die Medizin",
    categoryShoppingTitle = "Shopping",
    categoryOtherTitle = "Diverses",
    minutesSymbol = "m",
    hoursSymbol = "h",
    separator = ":",
    alertDialogDismissTitle = "Abschaffen",
    alertDialogSelectConfirmTitle = "Wählen",
    alertDialogOkConfirmTitle = "OK",
    categoryEmptyTitle = "Fehlt",
    expandedViewToggleTitle = "Erweiterte Ansicht",
    compactViewToggleTitle = "Kompakte Optik",
    warningDialogTitle = "Warnung!",
    warningDeleteConfirmTitle = "Entfernen",
    hoursTitle = "Uhr",
    minutesTitle = "Minuten",
    homeTabTitle = "Heim",
    analyticsTabTitle = "Analytik",
    settingsTabTitle = "Einstellungen",
    mainDrawerTitle = "Startseite",
    drawerMainSection = "Pläne",
    templateDrawerTitle = "Muster",
    categoriesDrawerTitle = "Kategorien",
    splitFormat = "%s | %s",
    amFormatTitle = "AM",
    pmFormatTitle = "PM",
    repeatTimeDayInWeekTitle = "Jede Woche",
    repeatTimeWeekDayInMonthTitle = "Jede Woche des Monats",
    repeatTimeDayInMonthTitle = "Jeden Monat",
    repeatTimeDayInYearTitle = "Jedes Jahr",
    sundayTitle = "Sonntag",
    mondayTitle = "Montag",
    tuesdayTitle = "Dienstag",
    wednesdayTitle = "Mittwoch",
    thursdayTitle = "Donnerstag",
    fridayTitle = "Freitag",
    saturdayTitle = "Samstag",
    januaryTitle = "Januar",
    februaryTitle = "Februar",
    marchTitle = "März",
    aprilTitle = "April",
    mayTitle = "Mai",
    juneTitle = "Juni",
    julyTitle = "Juli",
    augustTitle = "August",
    septemberTitle = "September",
    octoberTitle = "Oktober",
    novemberTitle = "November",
    decemberTitle = "Dezember",
)

internal val spanishTimePlannerString = TimePlannerStrings(
    appName = "Time Planner",
    authorTitle = "Creado por Aleshin Stanislav",
    startTaskNotifyText = "Inicio del evento",
    timeTaskChannelName = "Eventos",
    categoryWorkTitle = "Trabajo",
    categoryRestTitle = "Tiempo libre",
    categorySportTitle = "Deporte",
    categorySleepTitle = "Descanso",
    categoryCultureTitle = "Cultura",
    categoryAffairsTitle = "Quehaceres",
    categoryTransportTitle = "Viajes",
    categoryStudyTitle = "Estudio",
    categoryEatTitle = "Comidas",
    categoryEntertainmentsTitle = "Entretenimiento",
    categoryHugieneTitle = "Aseo personal",
    categoryHealthTitle = "Medicina",
    categoryShoppingTitle = "Compras",
    categoryOtherTitle = "Varios",
    minutesSymbol = "m",
    hoursSymbol = "h",
    separator = ":",
    alertDialogDismissTitle = "Cancelar",
    alertDialogSelectConfirmTitle = "Guardar",
    alertDialogOkConfirmTitle = "Vale",
    categoryEmptyTitle = "Ninguna",
    expandedViewToggleTitle = "Vista ampliada",
    compactViewToggleTitle = "Vista compacta",
    warningDialogTitle = "¡Cuidado!",
    warningDeleteConfirmTitle = "Eliminar",
    hoursTitle = "Horas",
    minutesTitle = "Minutos",
    homeTabTitle = "Inicio",
    analyticsTabTitle = "Estadísticas",
    settingsTabTitle = "Ajustes",
    mainDrawerTitle = "Página principal",
    drawerMainSection = "Planes",
    templateDrawerTitle = "Plantillas",
    categoriesDrawerTitle = "Categorías",
    splitFormat = "%s | %s",
    amFormatTitle = "AM",
    pmFormatTitle = "PM",
    repeatTimeDayInWeekTitle = "Cada día",
    repeatTimeWeekDayInMonthTitle = "Cada semana",
    repeatTimeDayInMonthTitle = "Cada mes",
    repeatTimeDayInYearTitle = "Cada año",
    sundayTitle = "Domingo",
    mondayTitle = "Lunes",
    tuesdayTitle = "Martes",
    wednesdayTitle = "Miércoles",
    thursdayTitle = "Jueves",
    fridayTitle = "Viernes",
    saturdayTitle = "Sábado",
    januaryTitle = "Enero",
    februaryTitle = "Febrero",
    marchTitle = "Marzo",
    aprilTitle = "Abril",
    mayTitle = "Mayo",
    juneTitle = "Junio",
    julyTitle = "Julio",
    augustTitle = "Agosto",
    septemberTitle = "Septiembre",
    octoberTitle = "Octubre",
    novemberTitle = "Noviembre",
    decemberTitle = "Diciembre",
)

internal val persianTimePlannerString = TimePlannerStrings(
    appName = "Time Planner",
    authorTitle = "ایجاد شده توسط Aleshin Stanislav",
    startTaskNotifyText = "آغاز رویداد",
    timeTaskChannelName = "رویدادها",
    categoryWorkTitle = "کار",
    categoryRestTitle = "استراحت کن",
    categorySportTitle = "ورزش",
    categorySleepTitle = "خواب",
    categoryCultureTitle = "فرهنگ",
    categoryAffairsTitle = "امور",
    categoryTransportTitle = "حمل و نقل",
    categoryStudyTitle = "مطالعه",
    categoryEatTitle = "غذا خوردن",
    categoryEntertainmentsTitle = "سرگرمی",
    categoryHugieneTitle = "بهداشت فردی",
    categoryHealthTitle = "دارو",
    categoryShoppingTitle = "خرید",
    categoryOtherTitle = "متفرقه",
    minutesSymbol = "m",
    hoursSymbol = "h",
    separator = ":",
    alertDialogDismissTitle = "لغو",
    alertDialogSelectConfirmTitle = "انتخاب کنید",
    alertDialogOkConfirmTitle = "باشه",
    categoryEmptyTitle = "غایب",
    expandedViewToggleTitle = "نمای گسترده",
    compactViewToggleTitle = "نمای جمع و جور",
    warningDialogTitle = "هشدار!",
    warningDeleteConfirmTitle = "حذف کنید",
    hoursTitle = "تماشا کنید",
    minutesTitle = "دقیقه",
    homeTabTitle = "اصلی",
    analyticsTabTitle = "تجزیه و تحلیل",
    settingsTabTitle = "تنظیمات",
    mainDrawerTitle = "اصلی",
    drawerMainSection = "برنامه ها",
    templateDrawerTitle = "قالب ها",
    categoriesDrawerTitle = "دسته بندی ها",
    splitFormat = "%s | %s",
    amFormatTitle = "",
    pmFormatTitle = "PM",
    repeatTimeDayInWeekTitle = "هر هفته",
    repeatTimeWeekDayInMonthTitle = "هر هفته از ماه",
    repeatTimeDayInMonthTitle = "هر ماه",
    repeatTimeDayInYearTitle = "هر سال",
    sundayTitle = "یکشنبه",
    mondayTitle = "دوشنبه",
    tuesdayTitle = "سه شنبه",
    wednesdayTitle = "چهارشنبه",
    thursdayTitle = "پنجشنبه",
    fridayTitle = "جمعه",
    saturdayTitle = "شنبه",
    januaryTitle = "ژانویه",
    februaryTitle = "فوریه",
    marchTitle = "مارس",
    aprilTitle = "آوریل",
    mayTitle = "ممکن است",
    juneTitle = "ژوئن",
    julyTitle = "جولای",
    augustTitle = "آگوست",
    septemberTitle = "سپتامبر",
    octoberTitle = "اکتبر",
    novemberTitle = "نوامبر",
    decemberTitle = "دسامبر",
)

internal val frenchTimePlannerString = TimePlannerStrings(
    appName = "Time Planner",
    authorTitle = "Créée par Aleshin Stanislav",
    startTaskNotifyText = "Début de l'évènement",
    timeTaskChannelName = "Évènement",
    categoryWorkTitle = "Travail",
    categoryRestTitle = "Repos",
    categorySportTitle = "Sport",
    categorySleepTitle = "Sommeil",
    categoryCultureTitle = "Culture",
    categoryAffairsTitle = "Affaires",
    categoryTransportTitle = "Déplacement",
    categoryStudyTitle = "Études",
    categoryEatTitle = "Repas",
    categoryEntertainmentsTitle = "Divertissement",
    categoryHugieneTitle = "Hygiène personnelle",
    categoryHealthTitle = "Médecine",
    categoryShoppingTitle = "Shopping",
    categoryOtherTitle = "Divers",
    minutesSymbol = "m",
    hoursSymbol = "h",
    separator = ":",
    alertDialogDismissTitle = "Annuler",
    alertDialogSelectConfirmTitle = "Sélectionner",
    alertDialogOkConfirmTitle = "OK",
    categoryEmptyTitle = "Absent",
    expandedViewToggleTitle = "Affichage étendu",
    compactViewToggleTitle = "Affichage compact",
    warningDialogTitle = "Avertissement!",
    warningDeleteConfirmTitle = "Supprimer",
    hoursTitle = "Heures",
    minutesTitle = "Minutes",
    homeTabTitle = "Accueil",
    analyticsTabTitle = "Statistiques",
    settingsTabTitle = "Paramètres",
    mainDrawerTitle = "Principal",
    drawerMainSection = "Plans",
    templateDrawerTitle = "Modèles",
    categoriesDrawerTitle = "Categories",
    splitFormat = "%s | %s",
    amFormatTitle = "",
    pmFormatTitle = "",
    repeatTimeDayInWeekTitle = "Toutes les semaines",
    repeatTimeWeekDayInMonthTitle = "Toutes les semaines du mois",
    repeatTimeDayInMonthTitle = "Tout les mois",
    repeatTimeDayInYearTitle = "Tout les ans",
    sundayTitle = "Dimanche",
    mondayTitle = "Lundi",
    tuesdayTitle = "Mardi",
    wednesdayTitle = "Mercredi",
    thursdayTitle = "Jeudi",
    fridayTitle = "Vendredi",
    saturdayTitle = "Samedi",
    januaryTitle = "Janvier",
    februaryTitle = "Février",
    marchTitle = "Mars",
    aprilTitle = "Avril",
    mayTitle = "Mai",
    juneTitle = "Juin",
    julyTitle = "Juillet",
    augustTitle = "Août",
    septemberTitle = "Septembre",
    octoberTitle = "Octobre",
    novemberTitle = "Novembre",
    decemberTitle = "Décembre",
)

val LocalTimePlannerStrings = staticCompositionLocalOf<TimePlannerStrings> {
    error("Core Strings is not provided")
}

fun fetchCoreStrings(language: TimePlannerLanguage) = when (language) {
    TimePlannerLanguage.EN -> englishTimePlannerString
    TimePlannerLanguage.RU -> russianTimePlannerString
    TimePlannerLanguage.DE -> germanTimePlannerString
    TimePlannerLanguage.ES -> spanishTimePlannerString
    TimePlannerLanguage.FA -> persianTimePlannerString
    TimePlannerLanguage.FR -> frenchTimePlannerString
}
